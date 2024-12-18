/**
 * 区分マスタグリッド定義
 */

let MsyKbnGridColumns = [
    Column.text('KBN_NM', Messages['MsyKbnGrid.kbnNm'], 240, 'primaryKey', null),
    Column.text('KBN_MEI', Messages['MsyKbnGrid.kbnMei'], 300, 'notblank', null),
    Column.cell('INSERT_TS', Messages['MsyKbnGrid.insertTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    Column.cell('INSERT_ID', Messages['MsyKbnGrid.insertId'], 80, 'metaInfo', null),
    Column.cell('UPDATE_TS', Messages['MsyKbnGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    Column.cell('UPDATE_ID', Messages['MsyKbnGrid.updateId'], 80, 'metaInfo', null),
    Column.check('DELETE_F', Messages['MsyKbnGrid.deleteF'], 30, ''),
];
