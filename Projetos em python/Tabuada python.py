num=int(input('Insira o número que deseja ver sua tabuada:'))

tabuada=0
for i in range(10):
  tabuada+=1
  print(num,'X',tabuada,'=',(num*tabuada))
