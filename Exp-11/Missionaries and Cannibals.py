boat_side='Right'
missionary_on_right=3
cannibals_on_right=3
missionary_on_left=0
cannibals_on_left=0

print('M=', missionary_on_left, 'C=', cannibals_on_left, end=' ')
print('|-----B|', end=' ')
print('M=', missionary_on_right, 'C=', cannibals_on_right, end=' ')

while True:
  missionary=int(input('Enter no: of missionary in boat on'+boat_side+':'))
  cannibals=int(input('Enter no: of cannibals in boat on'+boat_side+':'))

  if(missionary+cannibals)!=1 and (missionary+cannibals)!=2:
    print('Invalid move')
    continue

  if boat_side=='Right':
    if missionary>missionary_on_right or cannibals>cannibals_on_right:
      print('Invalid move')
      continue
  
    missionary_on_right-=missionary
    cannibals_on_right-=cannibals

    missionary_on_left+=missionary
    cannibals_on_left+=cannibals

    print('M=', missionary_on_left, 'C=', cannibals_on_left, end=' ')
    print('|-----B|', end=' ')
    print('M=', missionary_on_right, 'C=', cannibals_on_right, end=' ')

    boat_side='Left'

  elif boat_side=='Left':
    if missionary>missionary_on_left or cannibals>cannibals_on_left:
      print('Invalid move')
      continue
  
    missionary_on_left-=missionary
    cannibals_on_left-=cannibals

    missionary_on_right+=missionary
    cannibals_on_right+=cannibals

    print('M=', missionary_on_left, 'C=', cannibals_on_left, end=' ')
    print('|-----B|', end=' ')
    print('M=', missionary_on_right, 'C=', cannibals_on_right, end=' ')

    boat_side='Right'

  if(missionary_on_right!=0 and missionary_on_right<cannibals_on_right)or(missionary_on_left!=0 and missionary_on_left<cannibals_on_left):
    print('You lose!')
    break
  if(missionary_on_left==3 and cannibals_on_left==3):
    print('You win!')
    break
