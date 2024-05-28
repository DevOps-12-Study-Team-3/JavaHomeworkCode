//ũ�Ⱑ N�� ���� A = A1, A2, ..., AN�� �ִ�.������ �� ���� Ai�� ���ؼ� ��ū�� NGE(i)�� ���Ϸ��� �Ѵ�.
// Ai�� ��ū���� �����ʿ� �����鼭 Ai���� ū �� �߿��� ���� ���ʿ� �ִ� ���� �ǹ��Ѵ�.�׷��� ���� ���� ��쿡 ��ū���� - 1�̴�.
//
//���� ���, A = [3, 5, 2, 7]�� ��� NGE(1) = 5, NGE(2) = 7, NGE(3) = 7, NGE(4) = -1�̴�.A = [9, 5, 4, 8]�� ��쿡�� 
// NGE(1) = -1, NGE(2) = 8, NGE(3) = 8, NGE(4) = -1�̴�.
//
//�Է�
//ù° �ٿ� ���� A�� ũ�� N(1 �� N �� 1, 000, 000)�� �־�����.��° �ٿ� ���� A�� ���� A1, A2, ..., AN(1 �� Ai �� 1, 000, 000)�� �־�����.
//
//���
//�� N���� �� NGE(1), NGE(2), ..., NGE(N)�� �������� ������ ����Ѵ�.

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