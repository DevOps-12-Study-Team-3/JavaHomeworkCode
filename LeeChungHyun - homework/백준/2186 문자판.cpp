//반드시 한 칸 이상 이동을 해야 하고, 같은 자리에 머물러 있을 수 없다.또, 같은 칸을 여러 번 방문할 수 있다.
//
//이와 같은 문자판과 K, 그리고 하나의 영단어가 주어졌을 때, 
// 이와 같은 영단어를 만들 수 있는 경로가 총 몇 개 존재하는지 알아내는 프로그램을 작성하시오.
//
//위의 예에서 영단어가 BREAK인 경우에는 다음과 같이 3개의 경로가 존재한다.
// 앞의 수는 행 번호, 뒤의 수는 열 번호를 나타낸다.
//
//(4, 2) (3, 2) (2, 2) (1, 2) (1, 1)
//(4, 2) (3, 2) (2, 2) (1, 2) (1, 3)
//(4, 2) (3, 2) (2, 2) (2, 3) (1, 3)
//입력
//첫째 줄에 N(1 ≤ N ≤ 100), M(1 ≤ M ≤ 100), K(1 ≤ K ≤ 5)가 주어진다.
// 다음 N개의 줄에는 M개의 알파벳 대문자가 주어지는데, 이는 N×M 크기의 문자판을 나타낸다.
// 다음 줄에는 1자 이상 80자 이하의 영단어가 주어진다.모든 문자들은 알파벳 대문자이며, 공백 없이 주어진다.
//
//출력
//첫째 줄에 경로의 개수를 출력한다.이 값은 231 - 1보다 작거나 같다.

#include<iostream>
using namespace std;

void input();

int N;
int M;
int K;

char board[101][101];
char str[81];

int len;

int dx[4] = { 1, -1, 0 ,0 };
int dy[4] = { 0 , 0 ,-1 , 1 };

// dp[i][x][y] : 좌표 (x,y)에서 인덱스 1~i 부분문자열이 구현되는 경우의 수
// dp[length K][][]의 summation이 정답
// dp[i][x][y]에서 dp[i+1][nx][ny]면 dp[i+1][nx][ny] += dp[i][x][y]

// 다시 말해 dp[n][x][y] = sum ( dp[n-1][bx][by] )

int dp[81][101][101];

int cnt;

void input() {
	cin >> N >> M >> K;
	for (int i = 0; i < N; i++) {
		for (int j = 0; j < M; j++) {
			cin >> board[i][j];
		}
	}
	string s;
	cin >> s;
	len = s.length();
	for (int i = 0; i < s.length(); i++) {
		str[i] = s[i];
	}
}

void dynamic() {
	for (int i = 1; i < K; i++) {
		for()
	}
}

void search(int x, int y, int n) {
	if (n == len) {
		cnt++;
		return;
	}
	for (int i = 0; i < 4; i++) {
		for (int j = 1; j <= K; j++) {
			int nx = x + j * dx[i];
			int ny = y + j * dy[i];
			if (0 <= nx && nx < N && 0 <= ny && ny < M) {
				if (board[nx][ny] == str[n]) {
					search(nx, ny, n + 1);
				}
			}
		}
	}
}

void words_number() {
	for (int i = 0; i < N; i++) {
		for (int j = 0; j < M; j++) {
			if (board[i][j] == str[0]) {
				search(i, j, 1);
			}
		}
	}
}

int main() {

	ios::sync_with_stdio(0);
	cin.tie(0);

	FILE* filestream;
	freopen_s(&filestream, "input.txt", "r", stdin);

	input();
	words_number();

	cout << cnt;

	return 0;

}