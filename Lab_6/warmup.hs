-- Name: Tanner Yilmaz
-- Assignment: Lab_6

--Part 1a
outfits = [(a, x, y, z) | a <- ["paisley scarf", "knit loop"], x <- ["jeans", "khaki"], y <- ["white shirt", "grey turtleneck", "pink polo", 
          "green hoodie"], z <- ["brogues", "converse", "sandals"]]

--Part 1b 
--If you only had a budget for two more articles, it makes most sense to buy two pairs of pants or one pair of pants and one pair of shoes because this will 
--increase the total number of distinct outfits you own by the most. As a general rule, buying an item of which you currently have the least number of items 
--increases the total number of distinct outfits you own by the most. With the addition of scarves to the wardrobe, there are a total of 48 distinct outfits.

--Part 1c
--lst = ["Mr.", "Ms.", "Mrs.", "Dr.", "Prof.", "Rev."] This is the list used for testing the honorifics function
newlst lst = lst ++ [x ++ " " ++ y | x <- lst, y <- lst]
honorifics lst = lst ++ newlst lst

--Part 1d 
l = [('A',"Alfa"), ('B',"Bravo"), ('C',"Charlie"), ('D',"Delta"), ('E',"Echo"), ('F',"Foxtrot"), ('G',"Golf"), ('H', "Hotel"), ('I', "India"), ('J', "Juliett"), ('K', "Kilo"), ('L', "Lima"), ('M', "Mike"), ('N', "November"), ('O', "Oscar"), ('P', "Papa"), ('Q', "Quebec"), ('R', "Romeo"), ('S', "Sierra"), ('T',"Tango"), ('U',"Uniform"), ('V',"Victor"), ('W',"Whiskey"), ('X',"X-ray"), ('Y',"Yankee"), ('Z',"Zulu")]
nato_wrd word = [snd xs | letter <- word, xs <- l, letter == fst xs]

--Part 2a
remainder x y = x `mod` y

--Part 2b
-- isEven function
isEven x = if x `mod` 2 == 0
           then True
           else False

--Part 2c
merge :: [Integer] -> [Integer] -> [Integer]
merge [] x = x
merge x [] = x
merge (x:xs) (y:ys)
  | x < y = x: merge (y:ys) xs
  | otherwise = y : merge ys (x:xs)

--Part 2d
removeMultiple l a = [x | x <- l, x `mod` a /= 0]