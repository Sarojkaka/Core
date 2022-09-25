
public class sumOfLeftLeaves {

	public static void main(String[] args) {
	// TODO Auto-generated method stub

	public int sumOfLeftLeaves(TreeNode root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null) {
			return sumOfLeftLeaves(root.right);
		} else {
			int count = 0;
			if (root.left.left == null && root.left.right == null) {
				count += root.left.val;
			} else {
				count += sumOfLeftLeaves(root.left);
			}
			count += sumOfLeftLeaves(root.right);
			return count;

		}
	}
}