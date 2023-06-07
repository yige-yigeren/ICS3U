package Lesson25;

public class BST {
    
    node3 root;

    BST(int a) {
        root = new node3(null, a, null);
    }


	void add (int a) {
		node3 temp = root;
		
		while (true) {
			if(a > temp.value && temp.right == null) {
				temp.right = new node3(null, a, null);
				break;
			}
			
			else if (a < temp.value && temp.left == null) {
				temp.left = new node3(null, a, null);
				break;
			}				
			else {
				if(a < temp.value)
					temp = temp.left;
				else
					temp = temp.right;
			}
		}	
	}
	
	boolean search(int a) {
		node3 temp = root;
		
		while(true) {
			if(temp.value == a)
				return true;
			else if (a < temp.value && temp.left == null)
				return false;
			else if (a > temp.value && temp.right == null)
				return false;
			else {	//moves temp
				if (a < temp.value)
					temp = temp.left;
				else
					temp = temp.right;				
			}			
		}
	}
	
	// prints the tree with a root of a
	static void print(node3 a) {
		if (a != null) {
			print (a.left);
			System.out.print(a.value + " ");
			print (a.right);	
		}	
	}

    static int leaves (node3 temp) {
        if (temp.left == null && temp.right == null) {
            return 1;
        } else if (temp.left == null) {
            return leaves(temp.right);
        } else if (temp.right == null) {
            return leaves(temp.left);
        } else {
            return leaves(temp.left) + leaves(temp.right);
        }
    }

    static int height (node3 temp) {
        if (temp.left == null && temp.right == null) {
            return 1;
        } else if (temp.left == null) {
            return 1 + height(temp.right);
        } else if (temp.right == null) {
            return 1 + height(temp.left);
        } else {
            if (height(temp.left) > height(temp.right)) {
                return 1 + height(temp.left);
            } else {
                return 1 + height(temp.right);
            }
        }
    }

	void sum (int a) {
		int sum = 0;
		node3 temp = root;
		while (temp.value != a) {
			if (a < temp.value) {
				sum += temp.value;
				temp = temp.left;
			} else if (a > temp.value) {
				sum += temp.value;
				temp = temp.right;
			} else {
				sum += temp.value;
				System.out.println(sum);
				break;
			}
		}
	}
}
