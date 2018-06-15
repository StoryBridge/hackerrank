package refactoring;

public class Refactoring {
	public static void main(String[] args) {
		pZgubun gubun = new pZgubun();
		gubun.checkDz = true;
		gubun.P_ZGUBUN(5);
	}
}

class pZgubun {
	public boolean checkDz = false;

	public void P_ZGUBUN(int P_ZGUBUN) {
		if (P_ZGUBUN == 1 || P_ZGUBUN == 3 || P_ZGUBUN == 4 || P_ZGUBUN == 5 || P_ZGUBUN == 15) {
			System.out.println("P_ZGUBUN is " + P_ZGUBUN);
			GET_BSID();
			GET_BSAD();
			GET_DZ(checkDz);
		} else if (P_ZGUBUN == 12 || P_ZGUBUN == 13) {
			System.out.println("P_ZGUBUN is " + P_ZGUBUN);
			GET_BSID();
			GET_BSAD();
		} else if (P_ZGUBUN == 6 || P_ZGUBUN == 8) {
			System.out.println("P_ZGUBUN is " + P_ZGUBUN);
			GET_BSID();
			GET_BSAD();
			GET_DZ(checkDz);
		} else if (P_ZGUBUN == 2 || P_ZGUBUN == 9 || P_ZGUBUN == 10 || P_ZGUBUN == 11 || P_ZGUBUN == 16) {
			System.out.println("P_ZGUBUN is " + P_ZGUBUN);
			GET_BSIK();
			GET_BSAK();
			GET_DZ(checkDz);
		} else {
			System.out.println("Exception");
		}

	}

	public void GET_BSID() {
		System.out.println("GET_BSID");
	}

	public void GET_BSAD() {
		System.out.println("GET_BSAD");
	}

	public void GET_BSIK() {
		System.out.println("GET_BSIK");
	}

	public void GET_BSAK() {
		System.out.println("GET_BSAK");
	}

	public void GET_BSIS() {
		System.out.println("GET_BSIS");
	}

	public void GET_BSAS() {
		System.out.println("GET_BSAS");
	}

	void GET_BSIS_DZ() {
		System.out.println("GET_BSIS_DZ");
	}

	void GET_BSAS_DZ() {
		System.out.println("GET_BSAS_DZ");
	}

	void GET_DZ(boolean checkDz) {
		if (checkDz = true) {
			GET_BSIS_DZ();
			GET_BSAS_DZ();
		}
		
	}
} // end P_ZGUBUN