/**
 * 区分値マスタグリッド定義
 */

let MKbnValueGridColumns = [
    Column.refer('KBN_NM', Messages['MKbnValueGrid.kbnNm'], 300, 'primaryKey', 'null'),
    Column.select('KBN_KB', Messages['MKbnValueGrid.kbnKb'], 30, 'primaryKey', { json: 'MKbnValueSearch.json', paramkey: 'KBN_NM', value: 'KBN_KB', label: 'KBN_KB_MEI' }),
    Column.text('KBN_KB_MEI', Messages['MKbnValueGrid.kbnKbMei'], 300, '', null),
    Column.comma('HYOJI_ON', Messages['MKbnValueGrid.hyojiOn'], 150, '', null),
    Column.text('CRITERIA', Messages['MKbnValueGrid.criteria'], 300, '', null),
    Column.cell('INSERT_DT', Messages['MKbnValueGrid.insertDt'], 285, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['MKbnValueGrid.insertBy'], 150, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['MKbnValueGrid.updateDt'], 285, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['MKbnValueGrid.updateBy'], 150, 'metaInfo', null),
    Column.check('DELETE_F', Messages['MKbnValueGrid.deleteF'], 30, ''),
];
