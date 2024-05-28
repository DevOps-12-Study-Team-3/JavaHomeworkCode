//���ƽý��� ����� ������ N���� �� �ٷ� ���� ��ٸ��� �ִ�.
//
//�� �������� ������ �����ϱ� ���� �ٿ����� ��ٸ��� �ִ� �����̴� 
// ���ڱ� �ڱⰡ �� �� �ִ� ����� ���� �ñ��� ����.
//
//�� ��� A�� B�� ���� �� �� ��������, �� ��� ���̿� A �Ǵ� B���� Ű�� ū ����� ����� �Ѵ�.
//
//�ٿ� ���ִ� ����� Ű�� �־����� ��, ���� �� �� �ִ� ���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//�Է�
//ù° �ٿ� �ٿ��� ��ٸ��� �ִ� ����� �� N�� �־�����. (1 �� N �� 500, 000)
//
//��° �ٺ��� N���� �ٿ��� �� ����� Ű�� ������� ������ �־�����.��� ����� Ű�� 231 ������� ���� �۴�.
//
//������� �� �ִ� ������� �Է��� �־�����.
//
//���
//���� �� �� �ִ� ���� ���� ����Ѵ�.

#include<iostream>
#include<stack>
using namespace std;

void input();
void search_pair();

int N;

// Ű ����
int h[500001];

// ����
long long p = 0;

// ������ ���� ����, ù ���ڴ� Ű, ��° ���ڴ� �����ؼ� �ߺ��ؼ� ������ ����
stack<pair<int, int>> s;

void input() {
	cin >> N;
	for (int i = 1; i <= N; i++) {
		cin >> h[i];
	}
}

void search_pair() {

	for (int i = 1; i <= N; i++) {

		while (!s.empty() && s.top().first < h[i]) {
			p += s.top().second;
			s.pop();
		}

		if (s.empty()) {
			s.push(make_pair(h[i], 1));
		}
		else if (s.top().first == h[i]) {
			int temp = s.top().second;
			p += temp;
			s.pop();
			if (!s.empty()) {
				p++;
			}
			s.push(make_pair(h[i], temp + 1));
		}
		else {
			p++;
			s.push(make_pair(h[i], 1));
		}
	}
}

int main() {

	ios::sync_with_stdio(0);
	cin.tie(0);

	//FILE* filestream;
	//freopen_s(&filestream, "input.txt", "r", stdin);

	input();
	search_pair();

	cout << p;

	return 0;

}