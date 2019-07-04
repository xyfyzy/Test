package Test;

public class Tree {
	public Integer data;
	public static Tree root;
	public Tree father;
	public Tree leftson;
	public Tree rightson;
	public boolean hasleftdata() {
		return leftson!=null;
	}
	public boolean hasrightdata() {
		return rightson!=null;
	}
	public void insertdata(Integer data,Tree father) {
		if(data.compareTo(father.data)==0) {
			return ;
		}
		if(data.compareTo(father.data)<0) {
			if(!father.hasleftdata()) {
				father.leftson = new Tree();
				father.leftson.data  = data;
				father.leftson.father = father;
			}else {
				insertdata(data,father.leftson);
			}
		}
		if(data.compareTo(father.data)>0) {
			if(!father.hasrightdata()) {
				father.rightson = new Tree();
				father.rightson.data = data;
				father.rightson.father = father;
			}else {
				insertdata(data,father.rightson);
			}
		}
	}
	public void insertdata(Integer data) {
		if(root==null) {
			root = new Tree();
			root.data = data;
			return ;
		}else {
			insertdata(data,root);
		}
	}
}
