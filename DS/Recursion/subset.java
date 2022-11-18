class subset{
    public static void main(String[] args){
    String p = "";
    String s = "abc";
    solution(p,s);

    }
    static void solution(String p, String up){
        if(up == "" && p!="")
        {
            System.out.println(p);
            return;
        }
        solution(p+up.charAt(0),up.substring(1));
        solution(p,up.substring(1));
    }
}