package enums.sample;


import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class HttpStatusTest {

    @Test
    void compareTest() {
        HttpStatus okStatus = HttpStatus.OK;

        assertThat(okStatus == HttpStatus.OK).isTrue();
        assertThat(okStatus.equals(HttpStatus.OK)).isTrue();
    }

    @Test
    void valueOfWithExistedValueTest() {
        HttpStatus status = HttpStatus.valueOf("OK");

        assertThat(status == HttpStatus.OK).isTrue();
    }

    @Test
    void valueOfWithNonExistedValueTest() {
        assertThatThrownBy(()->{
            HttpStatus.valueOf("NONE");
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void valuesTest() {
        HttpStatus[] allValues = HttpStatus.values();

        assertThat(allValues).containsExactly(HttpStatus.OK, HttpStatus.CREATED, HttpStatus.NOT_FOUND);
    }

    @Test
    void statusCodeTest() {
        HttpStatus ok = HttpStatus.OK;
        HttpStatus created = HttpStatus.CREATED;
        HttpStatus notfound = HttpStatus.NOT_FOUND;

        assertThat(ok.getStatusCode()).isEqualTo(200);
        assertThat(created.getStatusCode()).isEqualTo(201);
        assertThat(notfound.getStatusCode()).isEqualTo(404);
    }

    @Test
    void switchStatementTest() {
        HttpStatus ok = HttpStatus.OK;
        HttpStatus created = HttpStatus.CREATED;
        HttpStatus notfound = HttpStatus.NOT_FOUND;

        assertThat(extractStatusCode(ok)).isEqualTo(200);
        assertThat(extractStatusCode(created)).isEqualTo(201);
        assertThat(extractStatusCode(notfound)).isEqualTo(404);
    }

    private int extractStatusCode(HttpStatus ok) {
        int result = 0;

        switch (ok) {
            case OK : result = 200; break;
            case CREATED: result = 201; break;
            case NOT_FOUND: result = 404; break;
            default: result = -1; break;
        }
        return result;
    }
}
