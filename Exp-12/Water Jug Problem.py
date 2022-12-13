from collections import defaultdict
visited=defaultdict(lambda:False)

jug1, jug2, final=(map(int, input('Enter the capacities of jug 1, jug 2 and required final:').split(' ')))

def waterJugProblem(x, y):
  if(x==final and y==0)or(x==0 and y==final):
    print(x, y)
    return True

  if visited[(x, y)]==False:
    print(x,y)

    visited[(x,y)]=True

    return(waterJugProblem(x,0)or waterJugProblem(0,y)or waterJugProblem(jug1, y)or waterJugProblem(x, jug2)or waterJugProblem(x+min(y, jug1-x), y-min(y,jug1-x))or waterJugProblem(x-min(x, jug2-y), y+min(x,(jug2-y))))

  else:
    return False

print('Solving water jug problem:')
waterJugProblem(0,0)
