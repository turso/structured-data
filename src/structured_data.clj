(ns structured-data)

(defn do-a-thing [x]
  (let [xx (+ x x)]
    (Math/pow xx xx)
    ))

(defn spiff [v]
 (let [zig (get v 0)
       zag (get v 2)]
   (+ zig zag)))

(defn cutify [v]
  (conj v "<3"))

(defn spiff-destructuring [v]
  (let [[a b c] v]
    (+ a c)
    ))

(defn point [x y]
  [x y])

(defn rectangle [bottom-left top-right]
  [bottom-left top-right])

(defn width [rectangle]
  (let [[[x1 y1] [x2 y2]] rectangle]
    (- x2 x1)))

(defn height [rectangle]
  (let [[[x1 y1] [x2 y2]] rectangle]
    (- y2 y1)))

(defn square? [rectangle]
  (let [[[x1 y1] [x2 y2]] rectangle]
    (if  (== (- x2 x1) (- y2 y1)) true false)
    ))

(defn area [rectangle]
  (let [[[x1 y1] [x2 y2]] rectangle]
    (* (- x2 x1) (- y2 y1))
  ))

(defn contains-point? [rectangle point]
  (let [[[x1 y1] [x2 y2]] rectangle
        [z1 z2] point]
    (and (<= x1 z1 x2) (<= y1 z2 y2))
    ))

(defn contains-rectangle? [outer inner]
 ( let[[[x1] [y1]] outer
        [[x2] [y2]] inner]
  (and (<= x1 x2 y1) (<= x1 y2 y1))
  ))

(defn title-length [book]
  (count(get book :title)))

(defn author-count [book]
  (count(get book :authors )))

(defn multiple-authors? [book]
  :-)

(defn add-author [book new-author]
  :-)

(defn alive? [author]
  :-)

(defn element-lengths [collection]
  :-)

(defn second-elements [collection]
  :-)

(defn titles [books]
  :-)

(defn monotonic? [a-seq]
  :-)

(defn stars [n]
  :-)

(defn toggle [a-set elem]
  :-)

(defn contains-duplicates? [a-seq]
  :-)

(defn old-book->new-book [book]
  :-)

(defn has-author? [book author]
  :-)

(defn authors [books]
  :-)

(defn all-author-names [books]
  :-)

(defn author->string [author]
  :-)

(defn authors->string [authors]
  :-)

(defn book->string [book]
  :-)

(defn books->string [books]
  :-)

(defn books-by-author [author books]
  :-)

(defn author-by-name [name authors]
  :-)

(defn living-authors [authors]
  :-)

(defn has-a-living-author? [book]
  :-)

(defn books-by-living-authors [books]
  :-)

; %________%

(do-a-thing 3)
(spiff [1 2 3 4 5 6])
(spiff [1 2 3])
(spiff-destructuring [1 2 3])
(spiff-destructuring [1 2 3 4 5 6])

(cutify [1 2 3])

(area (rectangle [1 1] [5 1]))
(area (rectangle [0 0] [1 1]))
(area (rectangle [0 0] [4 3]))
(area (rectangle [3 1] [10 4]))

(contains-point? (rectangle [0 0] [2 2])
                 (point 1 1))

(contains-point? (rectangle [0 0] [2 2])
                 (point -3 1))

(contains-point? (rectangle [0 0] [2 2])
                 (point 1 3))

(contains-point? (rectangle [1 1] [2 2])
                 (point 1 1))



