//N��M�� ��ķ� ǥ���Ǵ� ���� �ִ�.�ʿ��� 0�� �̵��� �� �ִ� ���� ��Ÿ����, 
// 1�� �̵��� �� ���� ���� �ִ� ���� ��Ÿ����.�� ĭ���� �ٸ� ĭ���� �̵��Ϸ���, �� ĭ�� �����ؾ� �Ѵ�.
// �� ĭ�� ���� ������ ��, �����ϴٰ� �Ѵ�.
//
//������ ���� ���ؼ� ������ ���غ����� �Ѵ�.
//
//���� �μ��� �̵��� �� �ִ� ������ �����Ѵ�.
//�� ��ġ���� �̵��� �� �ִ� ĭ�� ������ �����.
//�� ĭ���� �̵��� �� �ִ� ĭ�� �����¿�� ������ ĭ�̴�.
//
//�Է�
//ù° �ٿ� N(1 �� N �� 1, 000), M(1 �� M �� 1, 000)�� �־�����.���� N���� �ٿ� M���� ���ڷ� ���� �־�����.
//
//���
//���� ���·� ������ ����Ѵ�.���� �� ĭ�� ���� 0�� ����ϰ�, 
// ���� ���� �̵��� �� �ִ� ĭ�� ������ 10���� ���� �������� ����Ѵ�.

#include<iostream>
#include<set>
using namespace std;

// N x M
int N;
int M;

// ��
int map[1001][1001];

// �� ��ǥ
pair<int, int> wall[1000 * 1000 + 1];

// �� ����
int w;

// �������� �̵�
int dx[4] = { 1, -1, 0, 0 };
int dy[4] = { 0 ,0, 1, -1 };

// dfs�� ���� visit �迭, ���������� true
bool visit[1001][1001];

// 0�� ��� (������Ʈ) ����
int z;

// ������Ʈ �� ���� 0�� ����
int num_zero[1000 * 1000 + 1];

// �ӽ� ���庯��
int temp;

// �� �������� 0 ��� ������Ʈ �ε����� ���ľ� ������ ���� �� �迭
int af_map[1001][1001];

// �ϼ��� ������ ���� �迭
int ans_map[1001][1001];

void input();

void search_zero(int x, int y);
void make_afmap();

int near_zero(int x, int y);
void break_wall();

void input() {
	cin >> N >> M;
	for (int i = 0; i < N; i++) {
		string s;
		cin >> s;
		for (int j = 0; j < M; j++) {
			map[i][j] = s[j] - '0';
			if (map[i][j] == 1) {
				w++;
				wall[w] = make_pair(i, j);
			}
		}
	}
}

// 0�� ������Ʈ�� ã�� �߰� �۾� (dfs) �������� ���� �Լ��� �ٲ�Ƿ� �Լ��� ������ ��ǥ ���� 2��
void search_zero(int x, int y) {
	temp++;
	af_map[x][y] = z;
	for (int n = 0; n < 4; n++) {
		int nx = x + dx[n];
		int ny = y + dy[n];
		if (0 <= nx && nx < N && 0 <= ny && ny < M) {
			if (map[nx][ny] == 0 && !visit[nx][ny]) {
				visit[nx][ny] = true;
				search_zero(nx, ny);
			}
		}
	}
}

void make_afmap() {
	for (int i = 0; i < N; i++) {
		for (int j = 0; j < M; j++) {
			if (map[i][j] == 0 && !visit[i][j]) {
				z++;
				visit[i][j] = true;
				search_zero(i, j);
				num_zero[z] = temp;
				temp = 0;
			}
		}
	}
}

int near_zero(int x, int y) {
	set<int> s;
	int cnt = 0;
	for (int n = 0; n < 4; n++) {
		int nx = x + dx[n];
		int ny = y + dy[n];
		if (0 <= nx && nx < N && 0 <= ny && ny < M) {
			if (map[nx][ny] == 0) {
				s.insert(af_map[nx][ny]);
			}
		}
	}
	for (int idx : s) {
		cnt += num_zero[idx];
	}
	return cnt + 1;
}

void break_wall() {
	for (int i = 0; i < N; i++) {
		for (int j = 0; j < M; j++) {
			if (map[i][j] == 1) {
				ans_map[i][j] = near_zero(i, j) % 10;
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
	make_afmap();
	break_wall();

	for (int i = 0; i < N; i++) {
		for (int j = 0; j < M; j++) {
			cout << ans_map[i][j];
		}
		cout << endl;
	}

	return 0;

}