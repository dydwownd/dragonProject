package OneOnestart;

public class code_20211218 {

	public static void main(String[] args) {
		String play_time = "02:03:55";
		String adv_time = "00:14:15";
		String[] logs = {"01:20:15-01:45:14", "00:40:31-01:00:00", "00:25:50-00:48:29", "01:30:59-01:53:29", "01:37:44-02:02:30"};
		String answer = solution(play_time,adv_time,logs);
		System.out.println(answer);
	}
	
	public static String solution(String play_time, String adv_time, String[] logs) {
        long answer = 0;
        String[] sptP = play_time.split(":");
        int play = (Integer.parseInt(sptP[0])*60*60) + (Integer.parseInt(sptP[1])*60) + (Integer.parseInt(sptP[2]));
        String[] sptA = adv_time.split(":");
        int time = (Integer.parseInt(sptA[0])*60*60) + (Integer.parseInt(sptA[1])*60) + (Integer.parseInt(sptA[2]));
        int[] data = new int[play+1];
        
        for(int i=0; i<logs.length; i++) {
        	String[] temp = logs[i].split("-");
        	String[] spt1 = temp[0].split(":");
        	String[] spt2 = temp[1].split(":");
        	int start = (Integer.parseInt(spt1[0])*60*60) + (Integer.parseInt(spt1[1])*60) + (Integer.parseInt(spt1[2]));
        	int end = (Integer.parseInt(spt2[0])*60*60) + (Integer.parseInt(spt2[1])*60) + (Integer.parseInt(spt2[2]));
        	
        	for(int j=start; j<end; j++) {
        		data[j] += 1;
        	}
        }
        
        long max = 0;
        long value = 0;
        
        for(int i=0; i<time; i++) value += data[i];
        
        max = value;
        
        for(int i=time; i<play; i++) {
        	value += data[i];
        	value -= data[i-time];
        	if(max < value) {
        		max = value;
        		answer = i-time+1;
        	}
        }
        
        return String.format("%02d:%02d:%02d", answer/3600,(answer%3600)/60,(answer%3600)%60);
    }
	
}
