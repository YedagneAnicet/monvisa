CREATE TABLE utilisateur (
    id SERIAL PRIMARY KEY,
    nom VARCHAR(50),
    prenom VARCHAR(255),
    email VARCHAR(255),
    mdp VARCHAR(50)
)