// ù° �ٿ��� ���� ������ �ڿ����� �־�����.
// ���� ������ 30 �����̴�.
// ��° �ٿ��� ���� ���Ե��� �ڿ����� ������ �ͺ��� ���ʷ� �־�����.
// ���� ������ �߰� ���� �� ���� ���� �ִ�.
// ���� ���Դ� 500g�����̸�, �ԷµǴ� ���Ե� ���̿��� ��ĭ�� �ϳ��� �ִ�.
// �� ��° �ٿ��� ���Ը� Ȯ���ϰ��� �ϴ� �������� ������ �־�����.
// Ȯ���� ������ ������ 7�����̴�.
// �� ��° �ٿ��� Ȯ���ϰ��� �ϴ� �������� ���԰� �ڿ����� �־�����, 
// �ԷµǴ� ���Ե� ���̿��� �� ĭ�� �ϳ��� �ִ�.
// Ȯ���ϰ��� �ϴ� ������ ���Դ� 40, 000���� �۰ų� ���� �ڿ����̴�.
//
//���
//�־��� �� ������ ���Կ� ���Ͽ� Ȯ���� �����ϸ� Y, �ƴϸ� N �� ���ʷ� ����Ѵ�.
// ����� �� ���� �ٷ� �̷������, �� ������ ���� �� ���̿��� ��ĭ�� �ϳ��� �д�.

#include<iostream>
using namespace std;

void input();
void dp();

int N;
int weight[31];
int M;
int bead[8];

bool measure[15001][31] = { false };

void input() {
	cin >> N;
	for (int i = 1; i <= N; i++) {
		cin >> weight[i];
	}

	cin >> M;
	for (int i = 1; i <= M; i++) {
		cin >> bead[i];
	}
}

void dp() {

	measure[0][0] = true;

	for (int j = 1; j <= 30; j++) {
		for (int i = 0; i <= 15000; i++) {
			if (measure[i][j - 1] == true) {
				measure[i][j] = true;
			}
			if (i + weight[j] <= 15000) {
				if (measure[i + weight[j]][j - 1] == true) {
					measure[i][j] = true;
				}
			}
			if (measure[abs(i - weight[j])][j - 1] == true) {
				measure[i][j] = true;
			}
		}
	}

}

int main() {

	ios::sync_with_stdio(0);
	cin.tie(0);

	//FILE* filestream;
	//freopen_s(&filestream, "input.txt", "r", stdin);

	input();
	dp();

	for (int i = 1; i <= M; i++) {
		if (bead[i] > 15000) {
			cout << 'N' << " ";
		}
		else {
			if (measure[bead[i]][N] == 0) {
				cout << 'N' << " ";
			}
			else {
				cout << 'Y' << " ";
			}
		}
	}

	cout << endl;

	return 0;

}