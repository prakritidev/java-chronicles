
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class MeetingPairs {

    int start;
    int end;
    int index;

    MeetingPairs(int start, int end, int pos) {
        this.start = start;
        this.end = end;
        this.index = pos;
    }
}

public class MeetingRooms {

    public static void main(String[] args) {
        int n = 6;
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 5, 7, 9, 9};
        maxMeetinfgs(start, end, n);
        System.out.println();
    }

    private static void maxMeetinfgs(int[] start, int[] end, int n) {
        List<MeetingPairs> meetings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            meetings.add(new MeetingPairs(start[i], end[i], i));
        }
        Collections.sort(meetings, (o1, o2) -> {
            if(o1.end != o2.end) {
                return Integer.compare(o1.end, o2.end);
            } 
            return Integer.compare(o1.index, o2.index);
        });

        List<Integer> response = new ArrayList<>();
        response.add(meetings.get(0).index);

        int limit = meetings.get(0).end;

        for (int i = 1; i < meetings.size(); i++) {
            if(meetings.get(i).start > limit) {
                limit = meetings.get(i).end;
                response.add(meetings.get(i).index); 

            }
        }

        System.out.println(response);

    }
}
