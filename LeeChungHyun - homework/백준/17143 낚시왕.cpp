//낚시왕이 상어 낚시를 하는 곳은 크기가 R×C인 격자판으로 나타낼 수 있다.
// 격자판의 각 칸은(r, c)로 나타낼 수 있다.r은 행, c는 열이고, (R, C)는 아래 그림에서 가장 오른쪽 아래에 있는 칸이다.
// 칸에는 상어가 최대 한 마리 들어있을 수 있다.상어는 크기와 속도를 가지고 있다.
//
//
//
//낚시왕은 처음에 1번 열의 한 칸 왼쪽에 있다.다음은 1초 동안 일어나는 일이며, 아래 적힌 순서대로 일어난다.
// 낚시왕은 가장 오른쪽 열의 오른쪽 칸에 이동하면 이동을 멈춘다.
//
//낚시왕이 오른쪽으로 한 칸 이동한다.
//낚시왕이 있는 열에 있는 상어 중에서 땅과 제일 가까운 상어를 잡는다.상어를 잡으면 격자판에서 잡은 상어가 사라진다.
//상어가 이동한다.
//상어는 입력으로 주어진 속도로 이동하고, 속도의 단위는 칸 / 초이다.
// 상어가 이동하려고 하는 칸이 격자판의 경계를 넘는 경우에는 방향을 반대로 바꿔서 속력을 유지한채로 이동한다.
//
//왼쪽 그림의 상태에서 1초가 지나면 오른쪽 상태가 된다.
// 상어가 보고 있는 방향이 속도의 방향, 왼쪽 아래에 적힌 정수는 속력이다.왼쪽 위에 상어를 구분하기 위해 문자를 적었다.
//
//
//
//상어가 이동을 마친 후에 한 칸에 상어가 두 마리 이상 있을 수 있다.이때는 크기가 가장 큰 상어가 나머지 상어를 모두 잡아먹는다.
//
//낚시왕이 상어 낚시를 하는 격자판의 상태가 주어졌을 때, 낚시왕이 잡은 상어 크기의 합을 구해보자.
//
//입력
//첫째 줄에 격자판의 크기 R, C와 상어의 수 M이 주어진다. (2 ≤ R, C ≤ 100, 0 ≤ M ≤ R×C)
//
//둘째 줄부터 M개의 줄에 상어의 정보가 주어진다.
// 상어의 정보는 다섯 정수 r, c, s, d, z(1 ≤ r ≤ R, 1 ≤ c ≤ C, 0 ≤ s ≤ 1000, 1 ≤ d ≤ 4, 1 ≤ z ≤ 10000) 로 이루어져 있다. 
// (r, c)는 상어의 위치, s는 속력, d는 이동 방향, z는 크기이다.d가 1인 경우는 위, 2인 경우는 아래, 3인 경우는 오른쪽, 4인 경우는 왼쪽을 의미한다.
//
//두 상어가 같은 크기를 갖는 경우는 없고, 하나의 칸에 둘 이상의 상어가 있는 경우는 없다.
//
//출력
//낚시왕이 잡은 상어 크기의 합을 출력한다.

#include<iostream>
#include<set>
using namespace std;

const int MAX = 100;

// int d에 맞춰서 설정
int dr[5] = { 0, -1 , 1 , 0 , 0 };
int dc[5] = { 0, 0 , 0 , 1 , -1 };

// 상어 구조체
struct Shark {
	// 좌표 행, 렬
	int r;
	int c;
	// 속도
	int s;
	// 방향 1,2,3,4 -> 상하우좌
	int d;
	// 사이즈
	int z;
};

// 상어 배열
Shark shark[MAX * MAX + 1];

// 상어 죽었는지 체크 죽으면 false
bool is_alive[MAX * MAX + 1];

// 낚시장 크기 행, 렬
int R;
int C;

// 상어 마리수
int M;

// 상어가 있는지 체크 있으면 true 하려고 했지만 정확히 몇번 상어가 있는지도 필요
// 이동 후 한 칸에 여러마리 있을 수 있으므로 각 좌표에 하나씩 해시셋이 붙어있는게 편함
// 어차피 상어 들어가는 순서는 상관 없고 제거가 용이한 자료구조가 더 좋음

set<int> is_shark[MAX + 1][MAX + 1];

// 잡은 총 생선 크기
int fish;

int pos = 1;

void input();

// 각 상어가 한번 움직이는 메소드
void next_shark(int i);

// 모든 상어가 움직이고 서로 잡아먹는 메소드
void move_shark();

// 낚시꾼이 상어를 잡는 메소드
void fishing();

void input() {
	cin >> R >> C >> M;
	for (int i = 0; i < M; i++) {
		cin >> shark[i].r >> shark[i].c >> shark[i].s >> shark[i].d >> shark[i].z;
		// 상어가 하나 태어남
		is_alive[i] = true;
		// 각 상어의 좌표에 상어의 번호를 저장
		is_shark[shark[i].r][shark[i].c].insert(i);
	}
}

// i번째 상어의 이동
void next_shark(int i) {

	// 움직임이 행방향
	if (shark[i].d == 1 || shark[i].d == 2) {
		// 어차피 2R-2를 주기로 방향, 위치가 동일
		int speed = (shark[i].s) % (2 * R - 2);
		int move = 0;
		// 나머지 취한뒤 1씩 증가시킴
		while (move < speed) {
			// 움직여도 벽과 안 만나면 그냥 그 자리
			if (1 <= shark[i].r + dr[shark[i].d] && shark[i].r + dr[shark[i].d] <= R) {
				shark[i].r = shark[i].r + dr[shark[i].d];
			}
			// 벽을 만나면 방향도 변해야함
			else {
				shark[i].d = 3 - shark[i].d;
				shark[i].r = shark[i].r + dr[shark[i].d];
			}
			move++;
		}
	}
	// 위와 동일
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

// 전체 상어의 이동 후 잡아먹히는 것까지 갱신
void move_shark() {
	//문제는 잡아먹히는 것이 동시적인 사건이 아니고 모든 상어가 이동한 뒤에 발생
	for (int i = 0; i < M; i++) {
		// 죽어있는 건 움직이지 않음
		if (is_alive[i]) {
			// 움직이면 거기 있던 상어 제거
			is_shark[shark[i].r][shark[i].c].erase(i);
			next_shark(i);
			// 움직이고 난 뒤 상어 추가
			is_shark[shark[i].r][shark[i].c].insert(i);
		}
	}
	// 이제 각 좌표에 할당된 해시셋의 크기가 2 이상이면 제일 사이즈 큰 상어만 남기고 나머지는 죽여야함
	for (int i = 0; i < M; i++) {
		// 살아있는 것만
		if (is_alive[i]) {
			// 한 칸에 2개 이상 살아있는 상어가 있을 때
			if (is_shark[shark[i].r][shark[i].c].size() >= 2) {
				int big_shark = i;
				// 먼저 최대 사이즈 상어 찾기
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
		
		// 낚시
		for (int i = 1; i <= R; i++) {
			// 만약 낚시꾼이 있는 열에 상어가 하나라도 있다면
			if (!is_shark[i][pos].empty()) {
				// 어차피 각 칸에는 1마리의 상어만 있으므로 최초를 꺼내는 것과 동일
				int num_shark = *is_shark[i][pos].begin();
				// 잡은 상어 크기 추가
				fish += shark[num_shark].z;
				// 상어 죽임
				is_alive[num_shark] = false;
				// 상어 잡았으므로 비움
				is_shark[i][pos].clear();
				// 제일 가까운 상어만 잡음
				break;
			}
		}
		
		// 상어 이동
		move_shark();

		

		// 낚시꾼 이동
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