//ũ�Ⱑ H �� W�� �迭 A�� �� ���� X�� Y�� ���� ��, ũ�Ⱑ(H + X) ��(W + Y)�� �迭 B�� �迭 A�� �迭 A�� �Ʒ��� Xĭ, 
// ���������� Yĭ �̵���Ų �迭�� ���� ���� �� �ִ�.���� �������� ���� ��������.
//
//��, �迭 B��(i, j)�� ����ִ� ���� �Ʒ� 3�� �� �ϳ��̴�.
//
//(i, j)�� �� �迭 ��ο� ���Ե��� ������, Bi, j = 0�̴�.
//(i, j)�� �� �迭 ��ο� ���ԵǸ�, Bi, j = Ai, j + Ai - X, j - Y�̴�.
//(i, j)�� �� �迭 �� �ϳ��� ���ԵǸ�, Bi, j = Ai, j �Ǵ� Ai - X, j - Y�̴�.
//�迭 B�� ���� X, Y�� �־����� ��, �迭 A�� ���غ���.
//
//�Է�
//ù° �ٿ� �� ���� H, W, X, Y�� �־�����.��° �ٺ��� H + X���� �ٿ� �迭 B�� ���Ұ� �־�����.
//
//�׻� �迭 A�� �����ϴ� ��츸 �Է����� �־�����.
//
//���
//�� H���� �ٿ� �迭 A�� ���Ҹ� ����Ѵ�.

#include<iostream>

using namespace std;

const int MAX = 1000;

int H, W, X, Y;

int B[MAX][MAX];
int A[MAX][MAX];

void input() {
	cin >> H >> W >> X >> Y;
	for (int i = 0; i < H + X; i++) {
		for (int j = 0; j < W + Y; j++) {
			cin >> B[i][j];
		}
	}
}

void restore() {
	for (int i = 0; i < X; i++) {
		for (int j = 0; j < Y; j++) {
			A[i][j] = B[i][j];
		}
	}
	
	for (int i = X; i < H; i++) {
		for (int j = Y; j < W; j++) {
			A[i][j] = B[i][j] - A[i - X][j - Y];
		}
	}
}

int main() {

	ios::sync_with_stdio(0);
	cin.tie(0);

	FILE* filestream;
	freopen_s(&filestream, "input.txt", "r", stdin);

	input();

	restore();

	for (int i = 0; i < H; i++) {
		for (int j = 0; j < W; j++) {
			cout << B[i][j] << " ";
		}
		cout << endl;
	}

	for (int i = 0; i < H; i++) {
		for (int j = 0; j < W; j++) {
			cout << A[i][j] << " ";
		}
		cout << endl;
	}

}