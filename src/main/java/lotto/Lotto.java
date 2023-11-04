package lotto;

import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    // TODO: 추가 기능 구현

    public int countMatchingNumbers(List<Integer> lottoWinningNumbers){
        return (int) lottoWinningNumbers.stream()
                .filter(numbers::contains)
                .count();
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
