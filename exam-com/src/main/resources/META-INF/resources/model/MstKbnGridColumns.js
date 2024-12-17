/**
 * 区分マスタグリッド定義
 */

let MstKbnGridColumns = [
    Column.text('KBN_NM', Messages['MstKbnGrid.kbnNm'], 240, 'primaryKey', null),
    Column.text('KBN_MEI', Messages['MstKbnGrid.kbnMei'], 300, '', null),
    Column.cell('INSERT_DT', Messages['MstKbnGrid.insertDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['MstKbnGrid.insertBy'], 80, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['MstKbnGrid.updateDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['MstKbnGrid.updateBy'], 80, 'metaInfo', null),
    Column.check('DELETE_F', Messages['MstKbnGrid.deleteF'], 30, ''),
];
