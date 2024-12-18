/**
 * 区分値マスタグリッド定義
 */

let MsyKbnValGridColumns = [
    Column.refer('KBN_NM', Messages['MsyKbnValGrid.kbnNm'], 240, 'primaryKey', 'null'),
    Column.text('KBN_VAL', Messages['MsyKbnValGrid.kbnVal'], 30, 'primaryKey', null),
    Column.text('KBN_VAL_MEI', Messages['MsyKbnValGrid.kbnValMei'], 300, 'notblank', null),
    Column.comma('HYOJI_ON', Messages['MsyKbnValGrid.hyojiOn'], 80, 'notblank', null),
    Column.text('CRITERIA', Messages['MsyKbnValGrid.criteria'], 300, '', null),
    Column.cell('INSERT_TS', Messages['MsyKbnValGrid.insertTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    Column.cell('INSERT_ID', Messages['MsyKbnValGrid.insertId'], 80, 'metaInfo', null),
    Column.cell('UPDATE_TS', Messages['MsyKbnValGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    Column.cell('UPDATE_ID', Messages['MsyKbnValGrid.updateId'], 80, 'metaInfo', null),
    Column.check('DELETE_F', Messages['MsyKbnValGrid.deleteF'], 30, ''),
];
