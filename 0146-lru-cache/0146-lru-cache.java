class LRUCache {
    class Node {
        int key;
        int val;
        Node prev;
        Node next;

        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    Node head = new Node(-1, -1);
    Node tail = new Node(-1, -1);
    int cap;
    HashMap<Integer, Node> m = new HashMap<>();

    public LRUCache(int capacity) {
        cap = capacity;
        head.next = tail;
        tail.prev = head;
    }

    private void addNode(Node newnode) {
        Node temp = head.next; //Save the node currently after head

        newnode.next = temp; //Make newnode point to temp
        newnode.prev = head; //Make newnode point back to head

        head.next = newnode; //Update head to point to newnode
        temp.prev = newnode; //Make temp point back to newnode
    }

    private void deleteNode(Node delnode) {
        Node prevv = delnode.prev; //stores node of its left
        Node nextt = delnode.next; //stores node of its right

        prevv.next = nextt; //connect previous node to next node
        nextt.prev = prevv; //Connect next node back to previous node
    }

    public int get(int key) {
        if (m.containsKey(key)) { //if key exists
            Node resNode = m.get(key); //Get the corresponding node from the HashMap.
            int ans = resNode.val; //Store the value because we are going to move the node in the linked list.

            m.remove(key);//Temporarily remove the old mapping from the HashMap.
            deleteNode(resNode);//Remove the node from its current position.
            addNode(resNode);//Insert the node right after head, making it the most recently used.

            m.put(key, head.next);//Store the updated node reference in the HashMap.
            return ans;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (m.containsKey(key)) {
            Node curr = m.get(key);
            m.remove(key);//Remove old mapping from HashMap
            deleteNode(curr);//Remove old node from the linked list
        }

        if (m.size() == cap) { //if Cache is full
            m.remove(tail.prev.key);//Remove the least recently used key from HashMap
            deleteNode(tail.prev);//Remove the least recently used node from the list
        }

        addNode(new Node(key, value));//Add the new node
        m.put(key, head.next);//Store it in the HashMap
    }
}


//HashMap is used to find a node instantly to avoid list traversal