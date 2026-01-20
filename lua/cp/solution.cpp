#include <bits/stdc++.h>
using namespace std;

using i32 = int32_t;
using u32 = uint32_t;
using i64 = int64_t;
using u64 = uint64_t;

using vi32 = vector<i32>;
using vi64 = vector<i64>;
using vui32 = vector<u32>;

#define SEED_TIME srand(time(nullptr));

#define F first
#define S second
#define PB push_back
#define MP make_pair

#define SZ(x) ((int)(x).size())
#define SQ(x) ((x) * (x))
#define CU(x) ((x) * (x) * (x))

#define DEB(x) cout << #x << " = " << x << endl
#define DEB2(x, y) cout << #x << " = " << x << ", " << #y << " = " << y << endl

#define DEBVEC(v)                                                              \
  cout << #v << " : ";                                                         \
  for (auto x : v)                                                             \
    cout << x << " ";                                                          \
  cout << endl

#define DEBVEC2D(v)                                                            \
  cout << #v << " :\n";                                                        \
  for (auto &row : v) {                                                        \
    for (auto x : row)                                                         \
      cout << x << "\t";                                                       \
    cout << "\n";                                                              \
  }

#define DEBMAP(m)                                                              \
  cout << #m << " : ";                                                         \
  for (auto &[k, v] : m)                                                       \
    cout << "{" << k << " -> " << v << "} ";                                   \
  cout << endl

#define FASTIO                                                                 \
  ios::sync_with_stdio(false);                                                 \
  cin.tie(nullptr);                                                            \
  cout.tie(nullptr);

#define REP(i, x, y) for (int i = (x); i <= (y); ++i)

#define REPR(i, x, y) for (int i = (x); i >= (y); --i)

#define NL '\n'

#define SP ' '

i32 _rand(i32, i32);
void solve();

int main() {
  SEED_TIME;
  FASTIO;
  solve();
  return EXIT_SUCCESS;
}

i32 _rand(i32 lo = INT_MIN, i32 hi = INT_MAX) {
  return lo + rand() % (hi - lo + 1);
}

void solve() {
  // Author: https://prerit714.cloud
}
