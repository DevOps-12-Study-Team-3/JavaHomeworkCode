//0�� �� ĭ, 1�� ��, 2�� ġŲ���̴�.
//
//(2, 1)�� �ִ� ����(1, 2)�� �ִ� ġŲ������ �Ÿ��� | 2 - 1 | +| 1 - 2 | = 2, (5, 5)�� �ִ� 
// ġŲ������ �Ÿ��� | 2 - 5 | +| 1 - 5 | = 7�̴�.����, (2, 1)�� �ִ� ���� ġŲ �Ÿ��� 2�̴�.
//
//(5, 4)�� �ִ� ����(1, 2)�� �ִ� ġŲ������ �Ÿ��� | 5 - 1 | +| 4 - 2 | = 6, (5, 5)�� �ִ� 
// ġŲ������ �Ÿ��� | 5 - 5 | +| 4 - 5 | = 1�̴�.����, (5, 4)�� �ִ� ���� ġŲ �Ÿ��� 1�̴�.
//
//�� ���ÿ� �ִ� ġŲ���� ��� ���� �����������̴�.���������� ���翡���� ������ ������Ű�� ���� �Ϻ� 
// ġŲ���� �����Ű���� �Ѵ�.���� ���� ���� �� ���ÿ��� ���� ������ ���� �� �� �ִ�  ġŲ���� ������ �ִ� M����� ����� �˾Ƴ�����.
//
//���ÿ� �ִ� ġŲ�� �߿��� �ִ� M���� ����, ������ ġŲ���� ��� ������Ѿ� �Ѵ�.
// ��� ����, ������ ġŲ �Ÿ��� ���� �۰� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//�Է�
//ù° �ٿ� N(2 �� N �� 50)�� M(1 �� M �� 13)�� �־�����.
//
//��° �ٺ��� N���� �ٿ��� ������ ������ �־�����.
//
//������ ������ 0, 1, 2�� �̷���� �ְ�, 0�� �� ĭ, 1�� ��, 2�� ġŲ���� �ǹ��Ѵ�.���� ������ 2N���� ���� ������, ��� 1���� �����Ѵ�.ġŲ���� ������ M���� ũ�ų� ����, 13���� �۰ų� ����.
//
//���
//ù° �ٿ� �����Ű�� ���� ġŲ���� �ִ� M���� ����� ��, ������ ġŲ �Ÿ��� �ּڰ��� ����Ѵ�.

#include<iostream>
#include<stack>
using namespace std;

void input();
void backtracking(int n);

struct coordinate {
	int x;
	int y;
};

int distance(coordinate a, coordinate b);

// NxN ũ�� ���� �ִ� 50
int N;

// �� ġŲ�� �� �ִ� 13
int M;

// ���� �ִ� 100��
coordinate house[101];

// ġŲ�� �ִ� 13
coordinate chicken[14];

// �� ġŲ�� ������� true
bool chosen[14];

// �� ��
int h;

// ġŲ�� ��
int c;

// ġŲ �Ÿ� 
int ans = 50 * 2 * 13;

void input() {

	cin >> N >> M;

	for (int i = 0; i < N; i++) {
		for (int j = 0; j < N; j++) {
			int p;
			cin >> p;
			if (p == 1) {
				h++;
				house[h].x = i;
				house[h].y = j;
			}
			else if (p == 2) {
				c++;
				chicken[c].x = i;
				chicken[c].y = j;
			}
		}
	}
}

int distance(coordinate a, coordinate b) {
	return abs(a.x - b.x) + abs(a.y - b.y);
}

int chicken_distance() {
	int dis = 0;
	for (int i = 1; i <= h; i++) {
		int temp = 2 * 50;
		for (int j = 1; j <= c; j++) {
			if (chosen[j]) {
				temp = min(temp, distance(house[i], chicken[j]));
			}
		}
		dis += temp;
	}
	return dis;
}

void backtracking(int n) {
	if (n == M) {
		ans = min(ans, chicken_distance());
		return;
	}
	for (int i = 1; i <= c; i++) {
		if (chosen[i]) {
			return;
		}
		else {
			chosen[i] = true;
			backtracking(n + 1);
			chosen[i] = false;
		}
	}
}

int main() {

	ios::sync_with_stdio(0);
	cin.tie(0);

	//FILE* filestream;
	//freopen_s(&filestream, "input.txt", "r", stdin);

	input();
	backtracking(0);
	cout << ans;

	return 0;

}