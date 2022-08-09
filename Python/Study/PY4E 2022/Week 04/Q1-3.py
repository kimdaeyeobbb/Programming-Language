text = 'It is 98.8% That is great!'

ipos = text.find('%')
piece = text[ipos-4:ipos]
print(piece)
value = float(piece)
print(value)