/**
 * 区分マスタグリッド定義
 */

let MKbnGridColumns = [
    Column.text('KBN_NM', Messages['MKbnGrid.kbnNm'], 300, 'primaryKey', null),
    Column.text('KBN_MEI', Messages['MKbnGrid.kbnMei'], 300, '', null),
    Column.cell('INSERT_DT', Messages['MKbnGrid.insertDt'], 285, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['MKbnGrid.insertBy'], 150, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['MKbnGrid.updateDt'], 285, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['MKbnGrid.updateBy'], 150, 'metaInfo', null),
    Column.check('DELETE_F', Messages['MKbnGrid.deleteF'], 30, ''),
];
