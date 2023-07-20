class Solution {
    public int solution(String s) {
        int answer = 0;
        StringBuilder currentNumber = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) { // 숫자인 경우
                answer = answer * 10 + Character.getNumericValue(c);
            } else { // 영단어인 경우
                currentNumber.append(c);
                int num = num(currentNumber.toString());
                if (num >= 0) { // 숫자로 변환 가능한 경우
                    answer = answer * 10 + num;
                    currentNumber.setLength(0); // StringBuilder를 초기화하여 다음 숫자 처리 준비
                }
            }
        }

        return answer;
    }

    public int num(String s) {
        switch (s.toLowerCase()) {
            case "zero": return 0;
            case "one": return 1;
            case "two": return 2;
            case "three": return 3;
            case "four": return 4;
            case "five": return 5;
            case "six": return 6;
            case "seven": return 7;
            case "eight": return 8;
            case "nine": return 9;
            default: return -1; // 숫자로 변환할 수 없는 경우
        }
    }
}

