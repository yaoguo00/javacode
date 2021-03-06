package likou_nowcoder_test;

//题目：二叉树的镜像
//题目链接：https://www.nowcoder.com/practice/564f4c26aa584921bc75623e48ca3011?tpId=13&tqId=11171&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
public class Test10 {
    public void mirror(TreeNode root) {
        if(root==null){
            return;
        }
        TreeNode node=root.left;
        root.left=root.right;
        root.right=node;
        mirror(root.left);
        mirror(root.right);
    }
}
