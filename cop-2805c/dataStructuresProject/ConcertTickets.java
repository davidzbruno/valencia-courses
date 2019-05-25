import java.util.*;

public class ConcertTickets{

    private List orgLine;
    private Queue waitlist;
    private List listOfTicketHolders;

    public ConcertTickets(List list){
        orgLine = list;
        waitlist = new ArrayDeque();
        listOfTicketHolders = new ArrayList(list.size());
    }

    public  <T> void removeFromLine(T person){
        if(orgLine.isEmpty() || !orgLine.contains(person)) return;
        orgLine.remove(person);
    }

    public <T> void insertInFront(T person){
        orgLine.add(0,person);
    }
        
    private <T> void addToWaitList(T person){
        waitlist.add(person);
    }

    private <T> void assignedTicket(T person){
        listOfTicketHolders.add(person);
    }

    public Queue printWaitlist(){
        if(!orgLine.isEmpty()){
           makeLists(); 
        }
        return waitlist;
    }

    public List listOfTicketHolders(){
        if(!orgLine.isEmpty()){
            makeLists(); 
        }
        return listOfTicketHolders;
    }

    public void makeLists(){
        //first 10 perpole are added to the assigned ticketHolders list
        for(int i = 0; i < 10; ++i){
            assignedTicket( orgLine.remove(0) );
        }

        //everyone else is added to the waitlist
        while(!orgLine.isEmpty()){
            addToWaitList( orgLine.remove(0) );
        }
    }
}

