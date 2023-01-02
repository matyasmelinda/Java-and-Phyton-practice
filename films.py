films = ['Avatar', 'Dumb and Dumber', 'Titanic','Pretty Woman', 'The Grinch','Man in Black']

print(films)

# remove film 'Titanic
films.remove('Titanic')
print(films)

# add film 'The Wolf of wall Street'
films.append('The Wolf of Wall Street')
print(films)

# length of list films
print(len(films))

# find a film by it's index
print(films[3])

# duration of films
duration = [180, 101, 90, 100, 96, 170]
print(duration)

# good or bad film
good_film = True
print('We will watch')

good_film = False
print('We will not watch')

# create dictionary
duration_films = {'Avatar': 180, 'Dumb and Dumber': 101, 'Pretty Woman': 90, 'The Grinch': 100, 'Man in black': 96, 'The Wolf of Wall Street': 170}


# add new values
duration_films['Harry Potter'] = 160

print(duration_films)

# verify duration
print(duration_films['Pretty Woman'])

# update values
duration_films['Dumb and Dumber'] = 95
print(duration_films)

# delete values
duration_films.pop('Man in black')
duration_films.get('Man in black', 'Will not play anymore')
print(duration_films)