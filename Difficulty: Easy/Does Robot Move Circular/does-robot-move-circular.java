class Solution {
            public static boolean isCircular(String s) {
                int x=0,y=0,d=0;
                for(char ch:s.toCharArray()) {
                    if(ch=='L')
                        d=(d+3)%4;
                    else if(ch=='R')
                        d=(d+1)%4;
                    else if(d==0)
                        y++;
                    else if(d==1)
                        x++;
                    else if(d==2)
                        y--;
                    else
                        x--;
                }

                return x==0&&y==0;
            }
       }