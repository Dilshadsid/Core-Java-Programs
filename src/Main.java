
class Overriden_annotation {
	void show() {
		System.out.println("super class");
	}
}

class Overriden_annotation2 extends Overriden_annotation {
	@Override
	void show() {
		System.out.println("sub class");
	}
}

class Main {
	public static void main(String[] args) {
		Overriden_annotation Annotation = new Overriden_annotation();
		Annotation.show();
		Overriden_annotation2 annotation2 = new Overriden_annotation2();
		annotation2.show();
	}

}
