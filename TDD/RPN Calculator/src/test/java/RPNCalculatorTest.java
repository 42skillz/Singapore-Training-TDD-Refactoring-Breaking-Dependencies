import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class RPNCalculatorTest {

    @Test
    public void should_add_2_number_when_expression_contains_2_numbers_with_plus_sign()
    {
        assertThat(new RPNCalculator().evaluate("1 2 +"))
                .isEqualTo("3");
    }

    @Test
    public void should_multiply_numbers_when_expression_contains_2_number_with_star_sign()
    {
        assertThat(new RPNCalculator().evaluate("2 2 *"))
                .isEqualTo("4");
    }

    @Test
    public void should_subtract_numbers_when_expression_contains_2_numbers_minus_sign()
    {
        assertThat(new RPNCalculator().evaluate("4 2 -"))
                .isEqualTo("2");
    }
    
    @Test
    public void should_divide_numbers_when_expression_contains_2_numbers_with_slash_sign()
    {
        assertThat(new RPNCalculator().evaluate("10 2 /"))
                .isEqualTo("5");
    }

    @Test
    public void should_add_and_subtract_when_expression_contains_2_numbers_then_plus_sign_then_1_number_and_minus_sign()
    {
        assertThat(new RPNCalculator().evaluate("4 2 + 3 -"))
                .isEqualTo("3");
    }
    
    @Test
    public void should_evaluate_when_expression_has_many_operator()
    {
        assertThat(new RPNCalculator().evaluate("3 5 8 * 7 + *"))
                .isEqualTo("141");
    }

    @Test
    public void should_return_number_delimited_by_newline_when_expression_doesnt_contains_operator()
    {
        assertThat(new RPNCalculator().evaluate("4 2 3"))
                .isEqualTo("4\n2\n3");
    }
}

