//크기가 N인 수열 A = A1, A2, ..., AN이 있다.수열의 각 원소 Ai에 대해서 오큰수 NGE(i)를 구하려고 한다.
// Ai의 오큰수는 오른쪽에 있으면서 Ai보다 큰 수 중에서 가장 왼쪽에 있는 수를 의미한다.그러한 수가 없는 경우에 오큰수는 - 1이다.
//
//예를 들어, A = [3, 5, 2, 7]인 경우 NGE(1) = 5, NGE(2) = 7, NGE(3) = 7, NGE(4) = -1이다.A = [9, 5, 4, 8]인 경우에는 
// NGE(1) = -1, NGE(2) = 8, NGE(3) = 8, NGE(4) = -1이다.
//
//입력
//첫째 줄에 수열 A의 크기 N(1 ≤ N ≤ 1, 000, 000)이 주어진다.둘째 줄에 수열 A의 원소 A1, A2, ..., AN(1 ≤ Ai ≤ 1, 000, 000)이 주어진다.
//
//출력
//총 N개의 수 NGE(1), NGE(2), ..., NGE(N)을 공백으로 구분해 출력한다.

#include<iostream>
#include<stack>
using namespace std;

const int MAX = 1000000;

int N;
int s[MAX];
int nge[MAX];


void input() {
	cin >> N;
	for (int i = 0; i < N; i++) {
		cin >> s[i];
		nge[i] = -1;
	}
}

void right_biggernumber() {
	stack<int> stack;
	stack.push(0);
	for (int i = 1; i < N; i++) {
		while (!stack.empty() && s[i] > s[stack.top()]) {
			nge[stack.top()] = s[i];
			stack.pop();
		}
		stack.push(i);
	}

	for (int i = 0; i < N; i++) {
		cout << nge[i] << " ";
	}
}

int main() {

	ios::sync_with_stdio(0);
	cin.tie(0);

	//FILE* filestream;
	//freopen_s(&filestream, "input.txt", "r", stdin);

	input();

	right_biggernumber();

}