// create a priority queue(min heap with regard to map.values())
PriorityQueue<Map.Entry<Integer, Integer>> q =
new PriorityQueue<>(Map.Entry.comparingByValue());
for (Map.Entry e : map.entrySet()) {
q.offer(e);
if (q.size() > k)
q.poll();
}
// create result list
List<Integer> res = new ArrayList<>();
for (Map.Entry e : q) {
res.add((int)e.getKey());
}
return res;