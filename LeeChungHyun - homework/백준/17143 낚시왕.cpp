//���ÿ��� ��� ���ø� �ϴ� ���� ũ�Ⱑ R��C�� ���������� ��Ÿ�� �� �ִ�.
// �������� �� ĭ��(r, c)�� ��Ÿ�� �� �ִ�.r�� ��, c�� ���̰�, (R, C)�� �Ʒ� �׸����� ���� ������ �Ʒ��� �ִ� ĭ�̴�.
// ĭ���� �� �ִ� �� ���� ������� �� �ִ�.���� ũ��� �ӵ��� ������ �ִ�.
//
//
//
//���ÿ��� ó���� 1�� ���� �� ĭ ���ʿ� �ִ�.������ 1�� ���� �Ͼ�� ���̸�, �Ʒ� ���� ������� �Ͼ��.
// ���ÿ��� ���� ������ ���� ������ ĭ�� �̵��ϸ� �̵��� �����.
//
//���ÿ��� ���������� �� ĭ �̵��Ѵ�.
//���ÿ��� �ִ� ���� �ִ� ��� �߿��� ���� ���� ����� �� ��´�.�� ������ �����ǿ��� ���� �� �������.
//�� �̵��Ѵ�.
//���� �Է����� �־��� �ӵ��� �̵��ϰ�, �ӵ��� ������ ĭ / ���̴�.
// �� �̵��Ϸ��� �ϴ� ĭ�� �������� ��踦 �Ѵ� ��쿡�� ������ �ݴ�� �ٲ㼭 �ӷ��� ������ä�� �̵��Ѵ�.
//
//���� �׸��� ���¿��� 1�ʰ� ������ ������ ���°� �ȴ�.
// �� ���� �ִ� ������ �ӵ��� ����, ���� �Ʒ��� ���� ������ �ӷ��̴�.���� ���� �� �����ϱ� ���� ���ڸ� ������.
//
//
//
//�� �̵��� ��ģ �Ŀ� �� ĭ�� �� �� ���� �̻� ���� �� �ִ�.�̶��� ũ�Ⱑ ���� ū �� ������ �� ��� ��ƸԴ´�.
//
//���ÿ��� ��� ���ø� �ϴ� �������� ���°� �־����� ��, ���ÿ��� ���� ��� ũ���� ���� ���غ���.
//
//�Է�
//ù° �ٿ� �������� ũ�� R, C�� ����� �� M�� �־�����. (2 �� R, C �� 100, 0 �� M �� R��C)
//
//��° �ٺ��� M���� �ٿ� ����� ������ �־�����.
// ����� ������ �ټ� ���� r, c, s, d, z(1 �� r �� R, 1 �� c �� C, 0 �� s �� 1000, 1 �� d �� 4, 1 �� z �� 10000) �� �̷���� �ִ�. 
// (r, c)�� ����� ��ġ, s�� �ӷ�, d�� �̵� ����, z�� ũ���̴�.d�� 1�� ���� ��, 2�� ���� �Ʒ�, 3�� ���� ������, 4�� ���� ������ �ǹ��Ѵ�.
//
//�� �� ���� ũ�⸦ ���� ���� ����, �ϳ��� ĭ�� �� �̻��� �� �ִ� ���� ����.
//
//���
//���ÿ��� ���� ��� ũ���� ���� ����Ѵ�.

#include<iostream>
#include<set>
using namespace std;

const int MAX = 100;

// int d�� ���缭 ����
int dr[5] = { 0, -1 , 1 , 0 , 0 };
int dc[5] = { 0, 0 , 0 , 1 , -1 };

// ��� ����ü
struct Shark {
	// ��ǥ ��, ��
	int r;
	int c;
	// �ӵ�
	int s;
	// ���� 1,2,3,4 -> ���Ͽ���
	int d;
	// ������
	int z;
};

// ��� �迭
Shark shark[MAX * MAX + 1];

// ��� �׾����� üũ ������ false
bool is_alive[MAX * MAX + 1];

// ������ ũ�� ��, ��
int R;
int C;

// ��� ������
int M;

// �� �ִ��� üũ ������ true �Ϸ��� ������ ��Ȯ�� ��� �� �ִ����� �ʿ�
// �̵� �� �� ĭ�� �������� ���� �� �����Ƿ� �� ��ǥ�� �ϳ��� �ؽü��� �پ��ִ°� ����
// ������ ��� ���� ������ ��� ���� ���Ű� ������ �ڷᱸ���� �� ����

set<int> is_shark[MAX + 1][MAX + 1];

// ���� �� ���� ũ��
int fish;

int pos = 1;

void input();

// �� �� �ѹ� �����̴� �޼ҵ�
void next_shark(int i);

// ��� �� �����̰� ���� ��ƸԴ� �޼ҵ�
void move_shark();

// ���ò��� �� ��� �޼ҵ�
void fishing();

void input() {
	cin >> R >> C >> M;
	for (int i = 0; i < M; i++) {
		cin >> shark[i].r >> shark[i].c >> shark[i].s >> shark[i].d >> shark[i].z;
		// �� �ϳ� �¾
		is_alive[i] = true;
		// �� ����� ��ǥ�� ����� ��ȣ�� ����
		is_shark[shark[i].r][shark[i].c].insert(i);
	}
}

// i��° ����� �̵�
void next_shark(int i) {

	// �������� �����
	if (shark[i].d == 1 || shark[i].d == 2) {
		// ������ 2R-2�� �ֱ�� ����, ��ġ�� ����
		int speed = (shark[i].s) % (2 * R - 2);
		int move = 0;
		// ������ ���ѵ� 1�� ������Ŵ
		while (move < speed) {
			// �������� ���� �� ������ �׳� �� �ڸ�
			if (1 <= shark[i].r + dr[shark[i].d] && shark[i].r + dr[shark[i].d] <= R) {
				shark[i].r = shark[i].r + dr[shark[i].d];
			}
			// ���� ������ ���⵵ ���ؾ���
			else {
				shark[i].d = 3 - shark[i].d;
				shark[i].r = shark[i].r + dr[shark[i].d];
			}
			move++;
		}
	}
	// ���� ����
	else {
		int speed = (shark[i].s) % (2 * C - 2);
		int move = 0;
		while (move < speed) {
			if (1 <= shark[i].c + dc[shark[i].d] && shark[i].c + dc[shark[i].d] <= C) {
				shark[i].c = shark[i].c + dc[shark[i].d];
			}
			else {
				shark[i].d = 7 - shark[i].d;
				shark[i].c = shark[i].c + dc[shark[i].d];
			}
			move++;
		}
	}
}

// ��ü ����� �̵� �� ��Ƹ����� �ͱ��� ����
void move_shark() {
	//������ ��Ƹ����� ���� �������� ����� �ƴϰ� ��� �� �̵��� �ڿ� �߻�
	for (int i = 0; i < M; i++) {
		// �׾��ִ� �� �������� ����
		if (is_alive[i]) {
			// �����̸� �ű� �ִ� ��� ����
			is_shark[shark[i].r][shark[i].c].erase(i);
			next_shark(i);
			// �����̰� �� �� ��� �߰�
			is_shark[shark[i].r][shark[i].c].insert(i);
		}
	}
	// ���� �� ��ǥ�� �Ҵ�� �ؽü��� ũ�Ⱑ 2 �̻��̸� ���� ������ ū �� ����� �������� �׿�����
	for (int i = 0; i < M; i++) {
		// ����ִ� �͸�
		if (is_alive[i]) {
			// �� ĭ�� 2�� �̻� ����ִ� �� ���� ��
			if (is_shark[shark[i].r][shark[i].c].size() >= 2) {
				int big_shark = i;
				// ���� �ִ� ������ ��� ã��
				for (int j : is_shark[shark[i].r][shark[i].c]) {
					if (shark[j].z > shark[big_shark].z) {
						big_shark = j;
					}
					is_alive[j] = false;
				}
				is_shark[shark[i].r][shark[i].c].clear();
				is_alive[big_shark] = true;
				is_shark[shark[i].r][shark[i].c].insert(big_shark);
			}
		}
	}
}

void fishing() {

	while (pos <= C) {
		
		// ����
		for (int i = 1; i <= R; i++) {
			// ���� ���ò��� �ִ� ���� �� �ϳ��� �ִٸ�
			if (!is_shark[i][pos].empty()) {
				// ������ �� ĭ���� 1������ �� �����Ƿ� ���ʸ� ������ �Ͱ� ����
				int num_shark = *is_shark[i][pos].begin();
				// ���� ��� ũ�� �߰�
				fish += shark[num_shark].z;
				// ��� ����
				is_alive[num_shark] = false;
				// ��� ������Ƿ� ���
				is_shark[i][pos].clear();
				// ���� ����� �� ����
				break;
			}
		}
		
		// ��� �̵�
		move_shark();

		

		// ���ò� �̵�
		pos++;
	}
}

int main() {

	ios::sync_with_stdio(0);
	cin.tie(0);

	FILE* filestream;
	freopen_s(&filestream, "input.txt", "r", stdin);

	input();
	fishing();
	cout << fish;

	return 0;

}