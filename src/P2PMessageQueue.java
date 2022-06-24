/**
 * This Queue maintains the queue of messages coming from connected clients.
 */
public class P2PMessageQueue {

    private P2PMessage head = null;
    private P2PMessage tail = null;


    /**
     * This method allows adding a message object to the existing queue.
     * @param oMessage
     */
    public synchronized void enqueue(P2PMessage oMessage){

//		#####################
//		### ADD CODE HERE ###
//		#####################

        P2PMessage temp = oMessage;
        if(!hasNodes()) {
            head = temp;
            tail = temp;
            return;
        }
        else {
            tail.next = temp;
            tail = temp;
        }
    }

    /**
     * This method allows removing a message object from the existing queue.
     * @return
     */
    public synchronized P2PMessage dequeue(){

//		#####################
//		### ADD CODE HERE ###
//		#####################

        if(hasNodes()) {
            P2PMessage temp = head;
            head = head.next;
            return temp;
        }
        return null;
    }


    public boolean hasNodes(){

//		#####################
//		### ADD CODE HERE ###
//		#####################

        return head != null;
    }
}