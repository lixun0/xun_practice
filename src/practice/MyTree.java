package practice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyTree {
        private final int DEFAULT_SIZE = 2;
        private int size;
        private int count;
        private Object[] nodes;

        public MyTree() {
            this.size = this.DEFAULT_SIZE;
            this.nodes = new Object[this.size];
            this.count = 0;
        }

        public MyTree(Node root) {
            this();
            this.count = 1;
            this.nodes[0] = root;
        }

        public MyTree(Node root, int size) {
            this.size = size;
            this.nodes = new Object[this.size];
            this.count = 1;
            this.nodes[0] = root;
        }

        public void add(Node node) {
            for (int i = 0; i < this.size; i++) {
                if (this.nodes[i] == null) {
                    nodes[i] = node;
                    break;
                }
            }
            this.count++;
        }

        public void check() {
            if (this.count >= this.size) {
                this.enlarge();
            }
        }


        public void add(Node node, Node parent) {
            this.check();
            node.setParent(this.position(parent));
            this.add(node);
        }


        public int position(Node node) {
            for (int i = 0; i < this.size; i++) {
                if (nodes[i] == node) {
                    return i;
                }
            }
            return -1;
        }
        public int getSize(){
            return this.count;
        }



        public Node getRoot(){
            return (Node) this.nodes[0];
        }


        @SuppressWarnings("unchecked")
        public List<Node> getAllNodes(){
            List<Node> list = new ArrayList<Node>();
            for(int i=0;i<this.size;i++){
                if(this.nodes[i] != null){
                    list.add((Node)nodes[i]);
                }
            }
            return list;
        }
        public int getDepth(){

            int max = 1;
            if(this.nodes[0] == null){
                return 0;
            }

            for(int i=0;i<this.count;i++){
                int deep = 1;
                int location = ((Node)(this.nodes[i])).getParent();
                while(location != -1 && this.nodes[location] != null){
                    location = ((Node)(this.nodes[location])).getParent();
                    deep++;
                }
                if(max < deep){
                    max = deep;
                }
            }
            return max;
        }

        public void enlarge(){
            this.size = this.size + this.DEFAULT_SIZE;
            Object[] newNodes = new Object[this.size];
            newNodes = Arrays.copyOf(nodes, this.size);
            Arrays.fill(nodes, null);
            this.nodes = newNodes;
            System.out.println("enlarge");
        }
    }


