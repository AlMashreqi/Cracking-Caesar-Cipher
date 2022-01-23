import matplotlib.pylab as plt

LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

def frequency_analysis(text):
    text = text.upper()

    letter_freqs = {}

    for char in LETTERS:
        letter_freqs[char] = 0

    for char in text:
        if char in LETTERS:
            letter_freqs[char] += 1

    return letter_freqs

def plot_distrubution(freqs):
    plt.bar(freqs.keys(), freqs.values())
    plt.show()
    
def ceasar_crack(cipher_text):
    freq = frequency_analysis(cipher_text)
    letter_freq = sorted(freq.items(), key = lambda x: x[1], reverse = True)
    return LETTERS.find(freq[0][0] - LETTERS.find('E'))

def caesar_decrypt(cipher_text, key):
    plain_text = ""
    for str in cipher_text:
        for char in str.upper():
            index = LETTERS.find(char)
            index = (index - key) % len(LETTERS)
            plain_text += LETTERS[index]
    return plain_text

if __name__ == '__main__':
    print(caesar_decrypt("", ceasar_crack("")))