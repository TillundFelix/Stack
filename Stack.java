public class Stack<ContentType> {

    public class StackNode {
        private ContentType content ;
        private StackNode nextNode;

        public StackNode(ContentType content) {
            this(content, null);
        }

        public StackNode(ContentType content, StackNode nextNode) {
            this.content = content;
            this.nextNode = nextNode;
        }

        public ContentType getContent() {
            return content;
        }

        public void setContent(ContentType content) {
            this.content = content;
        }

        public StackNode getNextNode() {
            return nextNode;
        }

        public void setNextNode(StackNode nextNode) {
            this.nextNode = nextNode;
        }
    }

    private StackNode topNode;
    
    public Stack() {
        this.topNode = null;
    }

    void push(ContentType content) {
        StackNode newNode = new StackNode(content, topNode);
        topNode = newNode;
    }

    boolean isEmpty() {
        return topNode == null;
    }

    void pop(){
        try {
            if (isEmpty()) {
                throw new Exception("Stack is empty");
            }
            topNode = topNode.getNextNode();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    ContentType top() {
        try {
            if (isEmpty()) {
                throw new Exception("Stack is empty");
            }
            return topNode.getContent();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    
}