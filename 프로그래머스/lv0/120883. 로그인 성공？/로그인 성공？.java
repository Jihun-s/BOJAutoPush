class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String id = id_pw[0];
        String pw = id_pw[1];

        for (String[] userInfo : db) {
            String dbId = userInfo[0];
            String dbPw = userInfo[1];

            if (id.equals(dbId)) {
                if (pw.equals(dbPw)) {
                    return "login"; // 아이디와 비밀번호가 모두 일치하는 경우
                } else {
                    return "wrong pw"; // 아이디는 일치하지만 비밀번호가 일치하지 않는 경우
                }
            }
        }

        return "fail"; // 아이디가 일치하는 회원 정보가 없는 경우
    }
}
