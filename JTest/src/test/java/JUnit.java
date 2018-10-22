
import java.util.*;
import org.hamcrest.collection.IsEmptyCollection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static jdk.vm.ci.code.CodeUtil.M;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;



//Test Class For ADT


//1.LinkedList
//2. Stack
//3. Queue
//4. Deque
//5. Set
//6. HashMap



public class JUnit {


    //                                                          LinkedList

    @Test
    public void jUnit(){
        List<Integer> actual = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);



        //1. Equal.
        assertThat(actual, is(expected));

        //2. Check LinkedList has this value
        assertThat(actual, hasItems(2));

        //3. Check Size of LinkedLlist
        assertThat(actual, hasSize(4));

        assertThat(actual.size(), is(5));

        //4. order of LinkedLisr

        // Ensure Correct order
        assertThat(actual, contains(1, 2, 3, 4, 5));

        // Can be any order
        assertThat(actual, containsInAnyOrder(5, 4, 3, 2, 1));

        //5. check empty Linkedlist
        assertThat(actual, not(IsEmptyCollection.empty()));

        assertThat(new ArrayList<>(), IsEmptyCollection.empty());


        //                                                         Stack


        Stack jStack = new Stack();
        jStack.push(2);
        jStack.push(3);
        Assertions.assertEquals(2,jStack.search(2));
        jStack.pop();
        Assertions.assertEquals(2,jStack.search(2));


        //                                                          Queue
        Queue jQueue = new PriorityQueue();
        jQueue.add(1);
        jQueue.add(2);
        jQueue.add(3);
        Assertions.assertEquals(2,((PriorityQueue) jQueue).comparator());


        //                                                          Deque


        Deque jDqueue = new ArrayDeque();
        jDqueue.contains(2);
        Assertions.assertEquals(2,1);

        //                                                          HashMap

        Map jMap = new HashMap();
        jMap.containsKey(2);
        jMap.containsKey(3);
        Assertions.assertEquals(2,3);
        Assertions.assertEquals(2,2);



    }
}
