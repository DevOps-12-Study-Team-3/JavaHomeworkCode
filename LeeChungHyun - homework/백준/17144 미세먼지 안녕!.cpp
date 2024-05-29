//�Է�
//ù° �ٿ� R, C, T(6 �� R, C �� 50, 1 �� T �� 1, 000) �� �־�����.
//
//��° �ٺ��� R���� �ٿ� Ar, c(-1 �� Ar, c �� 1, 000)�� �־�����.
// ����û���Ⱑ ��ġ�� ���� Ar, c�� - 1�̰�, ������ ���� �̼������� ���̴�. 
// - 1�� 2�� ���Ʒ��� �پ��� �ְ�, ���� �� ��, �Ʒ� ��� �� ĭ�̻� ������ �ִ�.
//
//���
//ù° �ٿ� T�ʰ� ���� �� ����� �濡 �����ִ� �̼������� ���� ����Ѵ�.

#include<iostream>
using namespace std;
const int MAX = 50;

// ���
int R;
int C;

// �ð�
int T;

// ����
int map[MAX + 1][MAX + 1];

// ����û���� ��ǥ
pair<int, int> air_conditioner[2];

// �����¿�
int dr[4] = { -1 , 1, 0, 0 };
int dc[4] = { 0, 0, -1, 1 };

// �ӽ� ���
int temp_map[MAX + 1][MAX + 1];


void input() {
	int a = 0;
	cin >> R >> C >> T;
	for (int i = 1; i <= R; i++) {
		for (int j = 1; j <= C; j++) {
			cin >> map[i][j];
			if (map[i][j] == -1) {
				air_conditioner[a].first = i;
				air_conditioner[a].second = j;
				a++;
			}
		}
	}
}

void output() {
	for (int i = 1; i <= R; i++) {
		for (int j = 1; j <= C; j++) {
			cout << map[i][j] << " ";
		}
		cout << endl;
	}
	cout << endl;
}

void diffusion() {

	for (int i = 1; i <= R; i++) {
		for (int j = 1; j <= C; j++) {
			temp_map[i][j] = map[i][j];
		}
	}

	for (int i = 1; i <= R; i++) {
		for (int j = 1; j <= C; j++) {
			if (map[i][j] != -1) {
				for (int n = 0; n < 4; n++) {
					int ni = i + dr[n];
					int nj = j + dc[n];
					if (1 <= ni && ni <= R && 1 <= nj && nj <= C) {
						if (map[ni][nj] != -1) {
							temp_map[i][j] += (map[ni][nj] / 5);
							temp_map[i][j] -= (map[i][j] / 5);
						}
					}
				}
			}
		}
	}

	for (int i = 1; i <= R; i++) {
		for (int j = 1; j <= C; j++) {
			map[i][j] = temp_map[i][j];
		}
	}
}

void refresh() {

	for (int i = 1; i <= R; i++) {
		for (int j = 1; j <= C; j++) {
			temp_map[i][j] = map[i][j];
		}
	}

	// ������ 

	for (int i = 1; i <= R; i++) {
		for (int j = 1; j <= C; j++) {
			map[i][j] = temp_map[i][j];
		}
	}

}

void after_time() {

}



int main() {

	ios::sync_with_stdio(0);
	cin.tie(0);

	FILE* filestream;
	freopen_s(&filestream, "input.txt", "r", stdin);

	input();
	output();
	diffusion();
	output();





	return 0;

}