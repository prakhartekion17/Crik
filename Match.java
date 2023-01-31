// package Match;
import java.util.Vector;
// import Team.Team;

//Match in progress
class Match{

    private int overs;
    void setOvers(int x)
    {
        overs=x;
    }

    void play()
    {
        Team A=new Team();
        Team B=new Team();
        int balls=overs*6;
       
        Vector<Integer> batA = new Vector<Integer>();  //innings stats
       
        Vector<Integer> batB = new Vector<Integer>();  
       
        int cnt=0;
        while(cnt<balls&&A.wickets<10)  //first innings
        {
            int perball= (int)(Math.random()*8);
            if(perball!=7)
            {
                A.runs+=perball;
                batA.add(perball);
            }
            else
            {
                A.wickets++;
                batA.add(-1);
            }
            cnt++;
        }
        System.out.println("First Innings : ");
        for(int i=0;i<batA.size();i++)
        {
            if(batA.get(i)==-1)
                System.out.print("W ");
            else
                 System.out.print(batA.get(i)+" ");
        }
        System.out.println();

        cnt=0;
        while(B.wickets<10&&cnt<balls)  //second innings
        {
            int perball= (int)(Math.random()*8);
            if(perball!=7)
            {
                B.runs+=perball;
                batB.add(perball);
            }
            else
            {
                B.wickets++;
                batB.add(-1);
            }
            cnt++;
            if(B.runs>A.runs)
            break;
        }
        System.out.println("Second Innings : ");
        for(int i=0;i<batB.size();i++)
        {
            if(batB.get(i)==-1)
                System.out.print("W ");
            else
                System.out.print(batB.get(i)+" ");
        }
        System.out.println();
        if(A.runs>B.runs)
        {
            int cur=A.runs-B.runs;
            System.out.println("Team A won by: "+cur+" runs");
        }
        else if(A.runs<B.runs)
        {
            int cur=10-B.wickets;
            System.out.println("Team B won by: "+cur+" wickets");

        }
        else
            System.out.println("Game Draw");

            System.out.println("Great Match!!");
    }
}
