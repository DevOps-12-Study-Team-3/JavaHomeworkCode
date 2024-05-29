//입력
//첫째 줄에 R, C, T(6 ≤ R, C ≤ 50, 1 ≤ T ≤ 1, 000) 가 주어진다.
//
//둘째 줄부터 R개의 줄에 Ar, c(-1 ≤ Ar, c ≤ 1, 000)가 주어진다.
// 공기청정기가 설치된 곳은 Ar, c가 - 1이고, 나머지 값은 미세먼지의 양이다. 
// - 1은 2번 위아래로 붙어져 있고, 가장 윗 행, 아랫 행과 두 칸이상 떨어져 있다.
//
//출력
//첫째 줄에 T초가 지난 후 구사과 방에 남아있는 미세먼지의 양을 출력한다.

#include<iostream>
using namespace std;
const int MAX = 50;

// 행렬
int R;
int C;

// 시간
int T;

// 지도
int map[MAX + 1][MAX + 1];

// 공기청정기 좌표
pair<int, int> air_conditioner[2];

// 상하좌우
int dr[4] = { -1 , 1, 0, 0 };
int dc[4] = { 0, 0, -1, 1 };

// 임시 행렬
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

	// 에어컨 

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