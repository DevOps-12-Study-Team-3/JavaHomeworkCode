//N×M의 행렬로 표현되는 맵이 있다.맵에서 0은 이동할 수 있는 곳을 나타내고, 
// 1은 이동할 수 없는 벽이 있는 곳을 나타낸다.한 칸에서 다른 칸으로 이동하려면, 두 칸이 인접해야 한다.
// 두 칸이 변을 공유할 때, 인접하다고 한다.
//
//각각의 벽에 대해서 다음을 구해보려고 한다.
//
//벽을 부수고 이동할 수 있는 곳으로 변경한다.
//그 위치에서 이동할 수 있는 칸의 개수를 세어본다.
//한 칸에서 이동할 수 있는 칸은 상하좌우로 인접한 칸이다.
//
//입력
//첫째 줄에 N(1 ≤ N ≤ 1, 000), M(1 ≤ M ≤ 1, 000)이 주어진다.다음 N개의 줄에 M개의 숫자로 맵이 주어진다.
//
//출력
//맵의 형태로 정답을 출력한다.원래 빈 칸인 곳은 0을 출력하고, 
// 벽인 곳은 이동할 수 있는 칸의 개수를 10으로 나눈 나머지를 출력한다.

#include<iostream>
#include<set>
using namespace std;

// N x M
int N;
int M;

// 맵
int map[1001][1001];

// 벽 좌표
pair<int, int> wall[1000 * 1000 + 1];

// 벽 개수
int w;

// 동서남북 이동
int dx[4] = { 1, -1, 0, 0 };
int dy[4] = { 0 ,0, 1, -1 };

// dfs를 위한 visit 배열, 지나갔으면 true
bool visit[1001][1001];

// 0의 덩어리 (컴포넌트) 개수
int z;

// 컴포넌트 당 속한 0의 개수
int num_zero[1000 * 1000 + 1];

// 임시 저장변수
int temp;

// 원 지도에서 0 대신 컴포넌트 인덱스를 고쳐쓸 지도를 위한 새 배열
int af_map[1001][1001];

// 완성된 지도를 위한 배열
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

// 0의 컴포넌트를 찾는 중간 작업 (dfs) 시작점에 따라 함수가 바뀌므로 함수의 변수는 좌표 인자 2개
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