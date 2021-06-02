/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

/**
 *
 * @author asus
 */
public class BinaryTreePutri {
    NodePutri root;
    int size = 0;

    public BinaryTreePutri() {
        root = null;
    }

    boolean isEmty() {
        return root == null;
    }

    void add(int data) {
        if (isEmty()) { //tree is emty
            root = new NodePutri(data);
        } else {
            NodePutri current = root;
            while (true) {
                if (data < current.data) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new NodePutri(data);
                        break;
                    }
                } else if (data > current.data) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new NodePutri(data);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }

    void insert(int data) {
        root = addRecursive(root, data);
    }

    NodePutri addRecursive(NodePutri root, int data) {
        if (root == null) {
            root = new NodePutri(data);
            return root;
        }
        if (data < root.data) {
            root.left = addRecursive(root.left, data);
        } else if (data > root.data) {
            root.right = addRecursive(root.right, data);
        }
        return root;
    }

    boolean find(int data) {
        boolean hasil = false;
        NodePutri current = root;
        while (current != null) {
            if (current.data == data) {
                hasil = true;
                break;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return hasil;
    }

    void traversePreOrder(NodePutri node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(NodePutri node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(NodePutri node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    NodePutri getSuccessor(NodePutri del) {
        NodePutri successor = del.right;
        NodePutri successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        if (isEmty()) {
            System.out.println("Tree is Empty!");
        }
        NodePutri parent = root;
        NodePutri current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                NodePutri successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }

    public int findMin(NodePutri node) {
        if (node == null) {
            return Integer.MAX_VALUE;
        }
        int minimal = node.data;
        int left = findMin(node.left);
        int right = findMin(node.right);
        if (left < minimal) {
            minimal = left;
        }
        if (right < minimal) {
            minimal = right;
        }
        return minimal;
    }

    public int findMax(NodePutri node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }
        int maximum = node.data;
        int left = findMax(node.left);
        int right = findMax(node.right);
        if (left > maximum) {
            maximum = left;
        }
        if (right > maximum) {
            maximum = right;
        }
        return maximum;
    }

    public void dataLeaf(NodePutri node) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            System.out.print(node.data + " ");
            return;
        }
        if (node.left != null) {
            dataLeaf(node.left);
        }
        if (node.right != null) {
            dataLeaf(node.right);
        }
    }

    public void jumlahLeaf(NodePutri node) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            size++;
            return;
        }
        if (node.left != null) {
            jumlahLeaf(node.left);
        }
        if (node.right != null) {
            jumlahLeaf(node.right);
        }
    }
}
