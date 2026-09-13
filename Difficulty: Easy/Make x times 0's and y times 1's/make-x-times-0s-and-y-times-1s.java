class Solution {
    public String arrangeString(String s,int x,int y) {
        int a=0,b=0;
        for(char c:s.toCharArray()) {
            if(c=='0')
                a++;
            else
                b++;
        }
        StringBuilder res=new StringBuilder();
        while(a>0&&b>0) {
            for(int i=0;i<x&&a>0;i++) {
                res.append('0');
                a--;
            }
            for(int i=0;i<y&&b>0;i++) {
                res.append('1');
                b--;
            }
        }
        while(a>0) {
            res.append('0');
            a--;
        }
        while(b>0) {
            res.append('1');
            b--;
        }
        return res.toString();
    }
}