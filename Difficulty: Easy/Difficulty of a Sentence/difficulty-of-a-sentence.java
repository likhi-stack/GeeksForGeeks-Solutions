class Solution{
    int calcDiff(String s){
        String[] words=s.split(" ");
        int score=0;
        for(String word:words){
            int v=0,cons=0,conse=0;
            boolean hard=false;
            for(int i=0;i<word.length();i++){
                char ch=Character.toLowerCase(word.charAt(i));
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    v++;
                    conse=0;
                }else{
                    cons++;
                    conse++;

                    if(conse==4)
                        hard=true;
                }
            }
            if(cons>v)
                hard=true;
            if(hard)
                score+=5;
            else
                score+=3;
        }
        return score;
    }
}

